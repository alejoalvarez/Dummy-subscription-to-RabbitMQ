package co.com.bancolombia.commons.exceptions;

import co.com.bancolombia.commons.enums.TechnicalExceptionEnum;
import lombok.Getter;

@Getter
public class TechnicalException extends RuntimeException {

  private final TechnicalExceptionEnum exception;

  public TechnicalException(Throwable error, TechnicalExceptionEnum technicalException) {
    super(error);
    this.exception = technicalException;
  }

}