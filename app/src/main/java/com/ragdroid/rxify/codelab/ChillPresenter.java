package com.ragdroid.rxify.codelab;

import com.ragdroid.rxify.codelab.presenter.BaseCLPresenter;
import com.ragdroid.rxify.core.BaseSchedulerProvider;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by garimajain on 15/01/17.
 */

public class ChillPresenter extends BaseCLPresenter<Integer> implements CodeLabContract.Presenter {

    //Input
    Observable<Integer> inputValues = Observable.range(0, 10);

    //TODO Print only first five

    @Inject
    public ChillPresenter(BaseSchedulerProvider provider) {
        super(provider);
    }

    @Override
    protected Disposable getDisposable() {
        return inputValues
                .distinct()
                .compose(lazyTransformer)
                .subscribe(next, error, complete);
    }
}
