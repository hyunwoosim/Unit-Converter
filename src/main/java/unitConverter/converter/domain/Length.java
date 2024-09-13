package unitConverter.converter.domain;

import java.util.HashMap;
import java.util.Map;

public class Length {

    private final double valueInMeter;
    private static final Map<String, Double> conversionToMeters = new HashMap<>();
   // 해쉬 맵에 길이 단위 이름과 값을 넣어준다.
    static {
        conversionToMeters.put("millimeter", 0.001);
        conversionToMeters.put("centimeter", 0.01);
        conversionToMeters.put("meter", 1.0);
        conversionToMeters.put("kilometer", 1000.0);
        conversionToMeters.put("inch", 0.0254);
        conversionToMeters.put("foot", 0.3048);
        conversionToMeters.put("yard", 0.9144);
        conversionToMeters.put("maile", 1609.34);

    }

    // 입력 받은 값을 미터 단위로 변환 하여 저장한다.
    public Length(String unit,double value) {
        this.valueInMeter = toMeter(unit.toLowerCase(), value);

    }

    //미터로 변환한 값을 인치나 센티미터로 변환해서 반환 할 수 있기 때문에 사용
    public double getValue(String unit) {
        return meterTo(unit.toLowerCase(), this.valueInMeter);
    }

    // 값을 변환 해야 할 때 (ex. 인치 -->> 미터)
    private double toMeter(String unit, double value) {
        return value * conversionToMeters.get(unit.toLowerCase());
    }

    // 값을 변환 해야 할 때 (ex. 미터 -->> 인치)
    private double meterTo(String unit, double value) {
        return value / conversionToMeters.get(unit.toLowerCase());
    }



}
