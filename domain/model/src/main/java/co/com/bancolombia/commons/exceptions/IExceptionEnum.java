package co.com.bancolombia.commons.exceptions;

import co.com.bancolombia.commons.enums.ExceptionTypeEnum;

public interface IExceptionEnum {
  String name();
  String getTitle();
  String getDetail();
  ExceptionTypeEnum getType();
}