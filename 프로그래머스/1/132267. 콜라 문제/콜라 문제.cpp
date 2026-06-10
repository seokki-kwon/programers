#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int n) {
    int answer = 0;    
    
    while (n >= a) {
        int remain = 0;
        remain = (n % a);                
        n = (n / a) * b;        
        answer += n;
        n += remain;        
    }
    return answer;
}