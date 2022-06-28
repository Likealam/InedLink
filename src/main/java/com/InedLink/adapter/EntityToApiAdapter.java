package com.InedLink.adapter;

public interface EntityToApiAdapter <E,A>{
    A convertToApi(E entity);
    E convertToEntity(A api);
}
