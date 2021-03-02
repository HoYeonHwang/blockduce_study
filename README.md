## **블록체인**

- 중앙집권 방식이 아닌 분산 방식으로 진행
- 모든 거래 정보를 특정 제 3 기관이 아닌 거래를 하는 개인(Peer)이 감독 및 소유 및 배포

    ### **대표적인 블록체인 사용 범위**

    1. **비트코인**
        - P2P (Peer to Peer) : Server - Client 중앙 집중 관리 방식이 아닌 상호 연결된 노드들이 자원을 공유하는 형태
        - 분산원장 : 분산 DB 환경
            - 노드에 자료를 분산
            - **특징**
                - 누구나 장부를 만들 수 있다.
                - 누구나 장부를 볼 수 있다.
            - **문제점**
                - 해당 장부를 믿을 수 있는가?
                - 2개의 장부가 다르면 누굴 믿을 것인가?
        - 합의 알고리즘 : 채굴을 통한 합의 알고리즘 진행
            - 공개되있는 데이터를 각각의 노드 모두가 업데이트를 진행할 수 있다. 그렇다면 누가 그 업데이트를 주관할 것인가 라는 문제점이 발생한다.
            - **POW(Proof Of Work) - 비트코인 채굴 형태**
                - 해시파워(그래픽카드) 에 의한 합의
                - 전기세
            - **POS(Proof Of Stake)**
                - 보유지분에 의한 합의
            - **POA(Proof Of Authority) - IBM이 대표적인 방식**
                - 관리자에 의한 합의
                - 하이퍼레져
        - 개인키 공개키 시스템
            - 개인키
                - 예) 통장의 비밀번호
                - 코인의 소유권 입증
            - 공개키
                - 예 ) 통장의 공개적인 계좌번호
                - 코인 주소
    2. **이더리움**
        - Smart Contract

---

## **블록체인의 장점 / 단점**

### **장점**

- 제 3 개입이 필요가 없음 (분산화 된 네트워크)
- 해킹 안전 (암호화 / Hash)
- 거래 투명 (블록체인에 기록, 언제나 누구나 열람)
- 비용절감 (시스템 유지 보수 , 보안)
    - 메인 서버를 가져다놓고 보안하는 부분이 없어지기 때문에 비용 절감 효과

### **단점**

- P2P 방식 속도 저하
- 신속한 대응 불가 / 기술속도 (향후 5 - 10년정도 이후 정착가능 예상)
    - 잘못된 송금이 이뤄질 경우 대응이 힘듬.

### **향후 예상**

- 현재는 중앙 집중 형태로 복사본이 움직인다면, 블록체인을 통해서 미래에는 원본을 통해 움직이는 형태가 될것이다.

---

## **블록체인의 구조**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c59f0e95-7447-4832-84c6-8856d2a1c1bf/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c59f0e95-7447-4832-84c6-8856d2a1c1bf/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86bcf07e-0e1f-48c2-85b8-41617e04be6d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86bcf07e-0e1f-48c2-85b8-41617e04be6d/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1b4afe3-f536-4d27-98d1-6c286ff4fd82/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1b4afe3-f536-4d27-98d1-6c286ff4fd82/Untitled.png)

- Hash를 통해서 다음 블록을 가리키도록 한다.
- 각각의 형태가 이전 블록의 Hash값을 가지고 있고 해당 블록의 고유 Hash값을 나타낸다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64ad9797-814c-434c-a537-9b41943f596a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64ad9797-814c-434c-a537-9b41943f596a/Untitled.png)

---

## **SHA256 Hash**

- SHA 256 은 서명이라 생각하면 된다.
- 해당 해시값이 해당 블록을 나타내는 증명하는 서명의 역할을 하게 된다.
- Secure Hash Algorithms 256 - 2의 256승을 나타냄
- 쇄도 효과(avalanche effect) - 어떤 암호 알고리즘이 입력값에 미세한 변화를 줄 경우 출력값에 상당한 변화가 일어나는 성질을 의미

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e90a177-9d11-4319-b547-382ec095b511/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e90a177-9d11-4319-b547-382ec095b511/Untitled.png)

- Key 값을 넣으면 Hash Function에 의해서 hash값이 지정된다.
- 간혹 hash값이 중복되더라도 동일한 hash값 위치에 저장공간을 마련하여 중복을 피한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8783748-86bc-4445-8730-03bab287d93b/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8783748-86bc-4445-8730-03bab287d93b/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2a2e18e4-0890-4867-a1e6-107024e312f6/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2a2e18e4-0890-4867-a1e6-107024e312f6/Untitled.png)

---

## **개인키 공개키**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6c042bb-7f8b-4ede-8b0d-4c87db296669/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6c042bb-7f8b-4ede-8b0d-4c87db296669/Untitled.png)

- 본인의 개인키를 이용하여 암호화를 진행
- 암호화를 진행한 수신자에게 전송
- 수신자는 송신자의 공개키를 가지고 암호화된 데이터를 열 수 있음

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/44631c80-4080-447b-8a3f-a616cf6c3382/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/44631c80-4080-447b-8a3f-a616cf6c3382/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fac718f3-50b4-422d-b610-ad4f19f65dfe/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fac718f3-50b4-422d-b610-ad4f19f65dfe/Untitled.png)

- 개인키 - 256 비트 -> 32 바이트 -> 16진수로 표기하여 64자리 문자열로 나타남
- 공개키 - 타원을 중심으로 개인키 건너편에 공개키가 있다는 **타원 곡선 알고리즘**을 통하여 암호 알고리즘이 진행된다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e1e1ef9-bdd8-40a6-a5fc-be2fd7fa50c8/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e1e1ef9-bdd8-40a6-a5fc-be2fd7fa50c8/Untitled.png)

- message : a->b 1000 이라는 메세지를 적는다.
- 해당 메세지를 Private Key를 이용하여 Sign을 진행한다.
- Sign이 진행되면 Message Signature가 생성된다

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ef064e3-44a1-4a87-b1aa-9e16c7eacb58/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ef064e3-44a1-4a87-b1aa-9e16c7eacb58/Untitled.png)

- 이후 Verify 증명 단계에서 를 이용하여 Public Key를 이용해서 받아온 Message를 온전히 잘 받아왔는지 확인한다.
- 만약 받아온 message를 임의로 수정을 할 경우 증명이 불가능 한 상황을 확인 할 수 있다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7a8c8196-f38a-4dc1-b075-ef1d289c00cb/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7a8c8196-f38a-4dc1-b075-ef1d289c00cb/Untitled.png)

위의 상황을 도표화 하면 위와 같이 나타난다.

- 1번째 소유자의 개인키가 서명을 통해서 전자서명을 진행하고
- 1번째 소유자의 공개키를 이용하여 검증을 한다.

---

## **Transaction**

- 트랜잭션이란, 데이터베이스의 상태를 변화시키기 위해서 수행하는 작업의 단위를 뜻한다.
    - 예) 은행
        1. ATM기에 카드를 넣는다.
        2. 어떤 거래를 할지 선택을 한다.
        3. 비밀번호를 눌러 인증을 받는다.
        4. 거래를 완료한다.
    - 이 경우 전체의 거래 과정을 트랜잭션이라 볼 수 있다. 만약 하나의 과정에서 문제가 생기면 `원복`을 시키며 해당 문제를 인식하고 초기화로 돌려보내는 과정이 이뤄지는 일련의 과정 또한 트랜잭션의 조건이라 할 수 있다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/858f0965-c5a7-460a-903e-92d721882b40/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/858f0965-c5a7-460a-903e-92d721882b40/Untitled.png)

- Transaction에서 In / Out put이 있다는게 중요하다.
- 이 Input / Output을 이용하여 Transcation에서 작업이 이뤄진다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/13887e0f-a32c-40bc-b668-f15b84f48ff6/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/13887e0f-a32c-40bc-b668-f15b84f48ff6/Untitled.png)

- genesisTransaction : 최초의 트랜잭션은 IN이 없더라도 Out으로 최초 시작을 할 수 있다.
- UTXO (unspent transaction output) : 소비되지 않은 거래 출력값
    - 일반적으로 은행에는 고객의 계좌잔고가 존재하며 비트코인에는 자신의 주소에 잔고가 존재 안함.
    - 소비되지 않는 거래 출력값만 존재한다.
- Transaction 기능
    - Spent
        - UnSpent : 미사용 트랜잭션
        - Spent : 사용 트랜잭션
    - Confrimed : OutPut이 이뤄지게 된다면 블록에 저장이 되어야 한다.
        - Unconfirmed : 블록에 미 저장
            - 블록이 저장이 안될경우 롤백을 처리
        - Confirmed : 블록에 저장된 상태
            - 올바르게 output이 되었을 경우

---

## **블록체인 구조**

### **LinkedList**

- 자료구조 관점

### **Hash**

- SHA256 암호화, Digital Signature 관점
- Key값이 Hash를 통해 암호화를 이뤄짐.