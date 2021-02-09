package co.com.bancolombia.commons.enums;

import co.com.bancolombia.commons.exceptions.IExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TechnicalExceptionEnum implements IExceptionEnum {

  TECHNICAL_SERVER_ERROR( "Error interno en el servidor", "%s");

  private static final ExceptionTypeEnum TYPE = ExceptionTypeEnum.Technical;
  private String title;
  private String detail;

  @Override
  public ExceptionTypeEnum getType() {
    return TYPE;
  }

}
