# xqel
Xqel 은 SQL과 엑셀을 연결하는 프레임워크 입니다.

[![Gitter](https://badges.gitter.im/SeungyoonLee/xqel.svg)](https://gitter.im/SeungyoonLee/xqel?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# 목표
- 데이터 소스로 부터 엑셀 파일을 쉽게 만드는 방법을 제공.
- 데이터 소스로는 SQL, DB ResultSet, CSV 파일 등을 사용.
- 엑셀 형식 정의(제목줄 스타일 등)는 엑셀 파일을 템플릿으로 사용.

## 기능
- 제공된 데이터 소스를 지정한 엑셀 템플릿에 쓴다.
- 엑셀 처리 기능
   - 시트 복제
   - 하나 이상의 영역에 값 쓰기

# 사용방법
1. 엑셀 템플릿 파일 만들기
2. 쓰기 영역 지정
3. 값 위치 지정
4. 데이터 공급 지정
5. 블라블라

## 사용환경
- JRE 1.5+

# 제작 동기
주기적으로 만들어지는 여러 형태의 엑셀 보고서들이 있습니다. 보통 SQL을 실행하고 그 결과를 정해진 양식에 붙여넣는 방법으로 이런 보고서들이 만들어지곤 합니다. XQEL은 이런 작업을 자동화하기 위해 만들어졌습니다.