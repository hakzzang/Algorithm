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
		ExampleVector exampleVector = new ExampleVector();//exampleVector ����
		Vector<Movie> movieVector = new Vector<Movie>();//Movie�� �ڷ����� ���� �ִ� Vector ����
		movieVector.add(new Movie(10, "��������� ����"));//������ �߰�
		movieVector.add(new Movie(8, "����Ƣ���� �ϻ�"));//������ �߰�
		movieVector.add(new Movie(9,"������� ���� ������"));//������ �߰�
		
		Collections.sort(movieVector,new Comparator<Movie>() {//�α⵵ ������ �ø�����
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.popular - o2.popular;
			}
		});
		exampleVector.print(movieVector);//print
		Collections.reverse(movieVector);//�����͸� �������� ����
		exampleVector.print(movieVector);//print
		Collections.sort(movieVector, new Comparator<Movie>() {//�̸� ������ �ø�����
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		exampleVector.print(movieVector);//print
		Collections.reverse(movieVector);//�����͸� �������� ����
		exampleVector.print(movieVector);//print
		movieVector.setSize(1);//size�� 1�� ��
		exampleVector.print(movieVector);//print
		movieVector.add(new Movie(10, "�����4"));//������ �߰�
		exampleVector.print(movieVector);//print
		movieVector.setSize(0);//size�� 0���� ��
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
