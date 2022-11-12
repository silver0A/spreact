# 빌드 관련

### 🔥 개발

* back-end
    1. root 폴더로 이동
    2. 명령어 실행
    ```
    mvn spring-boot:run
    ```
* front-end
    1. frontend 폴더로 이동
    2. 명령어 실행
    ```
    yarn start
    ```

### 🔥 운영
1. root 폴더로 이동
2. 명령어 실행
```
mvn clean package -P prod
```
3. target 폴더 하단에 jar파일 생성 확인
4. 로컬에서 실행 테스트 시 target 폴더에서 하단 명령어 실행
```
java -jar [packagingName].jar
```