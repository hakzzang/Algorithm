package DataStructure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class ExampleVector {
	//MovieClass
	public static class Movie{
		int popular;
		String name;
		public Movie(int popular, String name) {
			this.popular = popular; 
			this.name = name;
		}
		
		public int getPopular() {
			return popular;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		ExampleVector exampleVector = new ExampleVector();//exampleVector 생성
		Vector<Movie> movieVector = new Vector<Movie>();//Movie의 자료형을 갖고 있는 Vector 생성
		movieVector.add(new Movie(10, "새우버거의 모험"));//데이터 추가
		movieVector.add(new Movie(8, "감자튀김의 일상"));//데이터 추가
		movieVector.add(new Movie(9,"가디언즈 오브 갤럭시"));//데이터 추가
		
		Collections.sort(movieVector,new Comparator<Movie>() {//인기도 순으로 올림차순
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.popular - o2.popular;
			}
		});
		exampleVector.print(movieVector);//print
		Collections.reverse(movieVector);//데이터를 역순으로 나열
		exampleVector.print(movieVector);//print
		Collections.sort(movieVector, new Comparator<Movie>() {//이름 순으로 올림차순
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		exampleVector.print(movieVector);//print
		Collections.reverse(movieVector);//데이터를 역순으로 나열
		exampleVector.print(movieVector);//print
		movieVector.setSize(1);//size를 1로 함
		exampleVector.print(movieVector);//print
		movieVector.add(new Movie(10, "어벤져스4"));//데이터 추가
		exampleVector.print(movieVector);//print
		movieVector.setSize(0);//size를 0으로 함
		exampleVector.print(movieVector);//print
		
	}
	
	public void print(Vector<Movie> vector) {
		System.out.print("item: ");
		vector.forEach((movie)->{
			System.out.print(String.format("%s,%d\t", movie.getName() , movie.getPopular()));
		});
		System.out.println("");
	}
}
