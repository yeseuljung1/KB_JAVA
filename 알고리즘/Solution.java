import java.util.*; // 배열 조작을 위한 Arrays 클래스 임포트

// Solution 클래스 선언
class Solution {
    // solution 메서드 선언: 참가자 배열(participant)과 완주자 배열(completion)을 입력받아, 완주하지 못한 참가자를 반환함
    public String solution(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant); // 참가자 배열 정렬
        Arrays.sort(completion);  // 완주자 배열 정렬

        // 2. 두 배열이 다를 때까지 찾는다
        int i; // 반복문 인덱스 변수 선언
        for (i = 0; i < completion.length; i++) {
            // 참가자 배열과 완주자 배열의 i번째 요소가 다를 경우
            if (!participant[i].equals(completion[i])) {
                // 다른 요소가 있는 경우, 해당 참가자는 완주하지 못한 것이므로 반환
                return participant[i];
            }
        }

        // 3. 반복문이 끝났다는 것은 마지막 참가자가 완주하지 못했다는 의미
        return participant[i]; // 마지막 참가자를 반환
    }
}
