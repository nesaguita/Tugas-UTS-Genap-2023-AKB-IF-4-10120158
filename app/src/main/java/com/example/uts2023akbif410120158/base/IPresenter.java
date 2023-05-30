package com.example.uts2023akbif410120158.base;

//10120158, Nerisa Sampa Guita, IF4

public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
