public static Map<Character, Integer> countVowelsAndConsonants(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('v', 0);
    map.put('c', 0);

    for (char ch : s.toCharArray()) {
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) continue;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            map.put('v', map.get('v') + 1);
        } else {
            map.put('c', map.get('c') + 1);
        }
    }

    return map;
}
