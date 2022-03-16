## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

---
- 구현 기능 목록
  - UI
    - 입력
      - 사용자 난수 입력 받기 [ ]
      - 사용자 게임 재시작 여부 입력 받기 [ ]
    - 출력
      - 사용에게 난수 입력 질의 출력 [ ]
      - 게임 결과 출력 [ ]
      - 재시작 여부 질의 출력 [ ]
  - 핵심 도메인 기능
    - 컴퓨터 3개 볼 생성 [O]
      - 숫자가 중복되지 않는 3개의 볼 생성 [O] 
        - 하나의 볼 생성 [O]
          - 1 ~ 9 범위의 난수 하나 생성 [O]
    - 사용자 입력과 컴퓨터 난수 비교 [O]
      - 사용자의 공 3개와 컴퓨터의 공 3개 비교 [O]
        - 컴퓨터의 야구공 3개와 사용자 야구공 1개 비교 [O]