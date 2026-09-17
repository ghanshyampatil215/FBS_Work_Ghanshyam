package com.fbs.demo;

public class MyArraylist {

	int[] arr;
	int index;
	int size;

	public MyArraylist() {
		this.size = 10;
		this.arr = new int[size];
		this.index = -1;
	}

	boolean isEmpty() {
		if (index == -1)
			return true;
		else
			return false;
	}

	int checkSize() {
		int pos = size * 75 / 100;
		return pos;
	}

	int[] resize() {
		size = size * 3 / 2;

		int[] temp = new int[size];

		for (int i = 0; i <= index; i++) {
			temp[i] = arr[i];
		}

		return temp;
	}

	void add(int data) {

		if (this.checkSize() - 1 == index) {
			arr = this.resize();
		}

		arr[++index] = data;

		System.out.println("Data inserted!");
	}

	int get(int i) {

		if (i < 0 || i > index)
			throw new IndexOutOfBoundsException();

		return arr[i];
	}

	void display() {

		if (isEmpty()) {
			System.out.println("ArrayList is empty!");
			return;
		}

		for (int i = 0; i <= index; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}