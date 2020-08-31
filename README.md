# board
게시판

# appliction-Oauth.yaml 설정
* application.yml에서 oauth프로파일을 로드
* oauth프로파일은 기밀정보가 있으므로 gitignore에 추가
* oauth프로파일은 아래와 같이 구성

<br>

```
spring:
  profiles: oauth

  security:
    oauth2:
      client:
        registration:
          google:
            clientId: XXX
            clientSecret: XXX
            scope:
              - email
              - profile
```

# 참고자료
* [1]: springboot yaml 프로파일: https://docs.spring.io/spring-boot/docs/1.2.0.M1/reference/html/howto-properties-and-configuration.html#howto-change-configuration-depending-on-the-environment