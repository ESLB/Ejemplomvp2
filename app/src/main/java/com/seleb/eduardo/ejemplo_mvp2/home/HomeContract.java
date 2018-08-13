package com.seleb.eduardo.ejemplo_mvp2.home;

import com.seleb.eduardo.ejemplo_mvp2.BasePresenter;
import com.seleb.eduardo.ejemplo_mvp2.BaseView;

public interface HomeContract {

    interface View extends BaseView<Presenter> {

        //Métodos que tendrá que realizar la vista
        void setEstaCosa(boolean active);

        void mostrarEstoOtro(int parametro1, int parametro2);

        void mostrarEsto();

        boolean isActive();
    }

    interface Presenter extends BasePresenter {

    }
}
