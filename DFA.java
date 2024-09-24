import java.util.*;

public class DFA {
        private Set<String> states;
        private Set<Character> alphabet;
        private String initialState;
        private Set<String> finalStates;
        private Map<String, Map<Character, String>> transitions;

        public DFA() {
            states = new HashSet<>();
            alphabet = new HashSet<>();
            finalStates = new HashSet<>();
            transitions = new HashMap<>();
        }

        public void addState(String state) {
            states.add(state);
        }

        public void addAlphabetSymbol(char symbol) {
            alphabet.add(symbol);
        }

        public void setInitialState(String state) {
            initialState = state;
        }

        public void addFinalState(String state) {
            finalStates.add(state);
        }

        public void addTransition(String fromState, char symbol, String toState) {
            transitions.putIfAbsent(fromState, new HashMap<>());
            transitions.get(fromState).put(symbol, toState);
        }

        public boolean accepts(String input) {
            String currentState = initialState;
            for (char symbol : input.toCharArray()) {
                if (!alphabet.contains(symbol)) {
                    return false; // Invalid input symbol
                }
                currentState = transitions.getOrDefault(currentState, Collections.emptyMap()).getOrDefault(symbol, null);
                if (currentState == null) {
                    return false; // No transition found
                }
            }
            return finalStates.contains(currentState);
        }

        public static void main(String[] args) {
            DFA dfa = new DFA();

            // Example DFA for accepting strings ending with 'ab'
            dfa.addState("q0");
            dfa.addState("q1");
            dfa.addState("q2");
            dfa.addAlphabetSymbol('a');
            dfa.addAlphabetSymbol('b');
            dfa.setInitialState("q0");
            dfa.addFinalState("q2");
            dfa.addTransition("q0", 'a', "q1");
            dfa.addTransition("q0", 'b', "q0");
            dfa.addTransition("q1", 'a', "q1");
            dfa.addTransition("q1", 'b', "q2");
            dfa.addTransition("q2", 'a', "q1");
            dfa.addTransition("q2", 'b', "q0");

            System.out.println("Accepts 'ab'?: " + dfa.accepts("ab"));
            System.out.println("Accepts 'aabab'?: " + dfa.accepts("aabab"));
            System.out.println("Accepts 'aabb'?: " + dfa.accepts("aabb"));
        }
    }

