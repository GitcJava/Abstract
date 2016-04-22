package util;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


public class BraceChecker {
    public static final int OPENED_BUT_NOT_CLOSED = 0;
    public static final int CLOSED_BUT_NOT_OPENED = 1;
    public static final int OPENED_BUT_CLOSED_ANOTHER = 3;
    private StackImpl<BracketItem> stack = new StackImpl();
    private String message = "No Error";
    private int errorIndex = -1;

    public String getMessage() {
        return this.message;
    }

    public int getErrorIndex() {
        return this.errorIndex;
    }

    private BraceChecker() {
    }

    public boolean parse(String text) {
        boolean isPassed = true;
        int numberInLine = 0;
        int lineNumber = 0;
        BraceChecker.BracketItem stackLastElement = null;
        char ch = 0;



        label53:
        for(int i = 0; i < text.length(); ++i) {
            ++this.errorIndex;
            ch = text.charAt(i);
            ++numberInLine;
            switch(ch) {
                case '\n':
                case '\r':
                    numberInLine = 0;
                    ++lineNumber;
                    break;
                case '(':
                case '[':
                case '{':
                    BraceChecker.BracketItem item = new BraceChecker.BracketItem(ch, numberInLine, lineNumber, i);
                    this.stack.push(item);
                    break;
                case ')':
                    stackLastElement = (BraceChecker.BracketItem)this.stack.pop();
                    if(stackLastElement == null || stackLastElement.getValue() != 40) {
                        isPassed = false;
                        break label53;
                    }
                    break;
                case ']':
                    stackLastElement = (BraceChecker.BracketItem)this.stack.pop();
                    if(stackLastElement == null || stackLastElement.getValue() != 91) {
                        isPassed = false;
                        break label53;
                    }
                    break;
                case '}':
                    stackLastElement = (BraceChecker.BracketItem)this.stack.pop();
                    if(stackLastElement == null || stackLastElement.getValue() != 123) {
                        isPassed = false;
                        break label53;
                    }
            }
        }

        if(!isPassed) {
            if(stackLastElement == null) {
                this.message = "closed \'" + ch + "\' but not opened ";
            } else {
                this.message = "opened \'" + stackLastElement.getValue() + "\' but closed \'" + ch + "\'";
            }
        } else if((stackLastElement = (BraceChecker.BracketItem)this.stack.pop()) != null) {
            this.message = "opened \'" + stackLastElement.getValue() + "\' but not closed";
            isPassed = false;
        }

        return isPassed;
    }

    public static void main(String[] args) {
        String s = "{[()] }";
        BraceChecker b = new BraceChecker();
        b.parse(s);
        System.out.println(b.getMessage());
    }

    public static class BracketItem {
        private char value;
        private int numberInLine;
        private int lineNumber;
        private int index;

        private  static final BraceChecker BRACE_CHECKER=new BraceChecker();

        public static BraceChecker getBraceChecker(){
            return BRACE_CHECKER;
        }

        public BracketItem(char value, int numberInLine, int lineNumber, int index) {
            this.value = value;
            this.numberInLine = numberInLine;
            this.lineNumber = lineNumber;
            this.index = index;
        }

        public char getValue() {
            return this.value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public int getNumberInLine() {
            return this.numberInLine;
        }

        public void setNumberInLine(int numberInLine) {
            this.numberInLine = numberInLine;
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public void setLineNumber(int lineNumber) {
            this.lineNumber = lineNumber;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
