class Solution {
    public int maximum69Number (int num) {
        char [] digits = String.valueOf(num).toCharArray();
        for (int i = 0 ; i<digits.length;i++) {
            if (digits[i]=='6') {
                digits[i]='9';
                break;
            }
        }
        int result = Integer.parseInt(new String(digits));
        return result;
    }
}
//num method
int num = 9669;

// find largest power of 10 <= num
int div = 1;
while (num / div >= 10) div *= 10;   // here div becomes 1000

while (div > 0) {
    int digit = (num / div) % 10;    // pick current left-most digit
    if (digit == 6) {
        num += 3 * div;              // flip 6 -> 9 adds 3 * place value
        break;
    }
    div /= 10;                        // move right one digit
}

// num is now 9969
