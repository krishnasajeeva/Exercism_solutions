class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuffer strDna = new StringBuffer(dnaStrand);
        for (int i = 0; i < strDna.length(); i++) {
            if (strDna.charAt(i) == 'G') {
                strDna.setCharAt(i, 'C');
            } else if (strDna.charAt(i) == 'C') {
                strDna.setCharAt(i, 'G');
            } else if (strDna.charAt(i) == 'T') {
                strDna.setCharAt(i, 'A');
            } else if (strDna.charAt(i) == 'A') {
                strDna.setCharAt(i, 'U');
            }
        }
        String ans = new String(strDna);
        return ans;
    }
}