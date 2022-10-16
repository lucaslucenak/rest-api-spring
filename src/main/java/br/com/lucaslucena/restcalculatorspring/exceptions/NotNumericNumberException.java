package br.com.lucaslucena.restcalculatorspring.exceptions;

import java.io.Serial;

public class NotNumericNumberException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public NotNumericNumberException(String msg) {
        super(msg);
    }
}
