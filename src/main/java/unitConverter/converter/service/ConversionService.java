package unitConverter.converter.service;

import unitConverter.converter.domain.Length;

public class ConversionService {

    public double convert(String type, String fromUnit, String toUnit, double value) {
        if(type.equalsIgnoreCase("length")) {
            return new Length(fromUnit, value).getValue(toUnit);
           // fromUnit : 현재 단위
            // toUnit : 변환 단위
            // 만약 타입이 "length"면 입력받은 값을 새로운 객체로 저장하고 목표 단위로 변환해서 리턴한다.
        }
        return 0.0;
    }
}
