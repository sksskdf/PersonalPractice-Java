package OOP.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}


//메타데이터,메타정보란 컴파일 과정과 실행 과정(런타임)에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보
//리플렉션이란 런타임시에 클래스의 메타 정보를 얻는 기능. @Retention어노테이션을 사용한다.