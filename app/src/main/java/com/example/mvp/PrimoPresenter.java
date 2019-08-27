package com.example.mvp;

public class PrimoPresenter implements Primo.Presenter{

    private Primo.View view;
    private Primo.Model model;

    public PrimoPresenter(Primo.View view){
        this.view = view;
        model = new PrimoModel(this);
    }

    @Override
    public void showResult(String result) {
        if(view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void Primo(String data) {
        if(view!=null){
            model.Primo(data);
        }
    }
}
