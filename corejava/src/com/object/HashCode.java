package com.object;

class Hash {
	int x;

	@Override
	public int hashCode() {

		return x;
	}
	
	public int jnmethod() {
		return super.hashCode();
	}
}

public class HashCode {
	public static void main(String[] args) {
		Hash hash = new Hash();
		int x = hash.hashCode();
		System.out.println("value:" + x);
		System.out.println(System.identityHashCode(hash));
		System.out.println(hash.jnmethod());

	}
}
