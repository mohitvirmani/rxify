package com.ragdroid.rxify.core;


import com.ragdroid.rxify.entity.FluxWeed;

import io.reactivex.Observable;

/**
 * Created by garimajain on 05/11/16.
 */

public interface MagicalDataSource {

    Observable<FluxWeed> getFluxweed();
}
