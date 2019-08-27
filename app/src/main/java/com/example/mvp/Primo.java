package com.example.mvp;

public interface Primo {

    interface View{
        void showResult(String result);
    }

    interface Presenter{
        void showResult(String result);
        void Primo(String data);
    }

    interface Model{
        void Primo(String data);
    }
}
