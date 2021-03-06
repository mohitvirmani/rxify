package com.ragdroid.rxify.logic;

import com.ragdroid.rxify.dagger.ActivityScope;
import com.ragdroid.rxify.home.HomeContract;
import com.ragdroid.rxify.home.HomePresenter;
import com.ragdroid.rxify.library.LibraryContract;
import com.ragdroid.rxify.library.LibraryPresenter;
import com.ragdroid.rxify.zip.ZipContract;
import com.ragdroid.rxify.zip.ZipPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 05/11/16.
 */
@Module
@ActivityScope
public class ActivityModule {

    @ActivityScope
    @Provides
    public HomeContract.Presenter provideHomePresenter(HomePresenter presenter) {
        return presenter;
    }

    @ActivityScope
    @Provides
    public ZipContract.Presenter provideZipPresenter(ZipPresenter presenter) {
        return presenter;
    }

    @ActivityScope
    @Provides
    public LibraryContract.Presenter provideLibraryPresenter(LibraryPresenter presenter) {
        return presenter;
    }

}
