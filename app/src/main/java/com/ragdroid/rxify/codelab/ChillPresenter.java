package com.ragdroid.rxify.codelab;

import com.ragdroid.rxify.codelab.presenter.BaseCLPresenter;
import com.ragdroid.rxify.core.BaseSchedulerProvider;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by garimajain on 15/01/17.
 */

public class ChillPresenter extends BaseCLPresenter<Long> implements CodeLabContract.Presenter {

    //Input
    Observable<Long> inputValues = Observable.interval(100, TimeUnit.MILLISECONDS);
    Observable<Long> cutOff = Observable.timer(250, TimeUnit.MILLISECONDS); //hint

    //TODO Print all values till 250 milliseconds

    @Inject
    public ChillPresenter(BaseSchedulerProvider provider) {
        super(provider);
    }

    @Override
    protected Disposable getDisposable() {
        return inputValues
                .skip(3)
                .compose(lazyTransformer)
                .subscribe(next, error, complete);
    }
}
