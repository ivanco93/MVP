package com.example.mvp;

public class PrimoModel implements Primo.Model {

    private Primo.Presenter presenter;
    private String resultado;

    public PrimoModel(PrimoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void Primo(String data) {
        int numero = Integer.valueOf(data);
        String mensaje = "";
        int contador = 0;
        // Recorremos todos los numero desde el 2 hasta el valor recibido
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                //Si se puede dividir por algun numero mas de una vez, no es primo
                contador++;
                if (contador > 1) {
                    i = numero;
                }
            }
        }

        if (contador > 1) {
            this.resultado = "NO es primo.";
        } else {
            this.resultado = "SI es primo.";
        }

        mensaje+="El número "+numero+" " + this.resultado;

        presenter.showResult(mensaje);
    }
}