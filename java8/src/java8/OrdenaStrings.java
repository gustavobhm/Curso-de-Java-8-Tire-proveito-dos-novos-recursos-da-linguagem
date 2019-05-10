package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});
//
//		palavras.sort((s1, s2) -> s1.length() - s2.length());

		Function<String, Integer> funcao = s -> s.length();
		Function<String, Integer> funcao2 = String::length;
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);

		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);

		palavras.forEach(palavra -> System.out.println(palavra));
		palavras.forEach(System.out::println);

	}

}