import java.util.Stack;
    public class ValidParentheses {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c); // Добавляем открывающую скобку в стек
                } else {
                    if (stack.isEmpty()) return false; // Нет открывающей скобки
                    char top = stack.pop(); // Берем верхний элемент
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false; // Несоответствие скобок
                    }
                }
            }

            return stack.isEmpty(); // Если стек пуст, значит все скобки закрыты
        }

        public static void main(String[] args) {
            System.out.println(isValid("()"));      // true
            System.out.println(isValid("()[]{}"));  // true
            System.out.println(isValid("(]"));      // false
            System.out.println(isValid("([])"));    // true
            System.out.println(isValid("([)]"));    // false
            System.out.println(isValid("{[]}"));    // true
        }
    }
