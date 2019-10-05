
public class Main {

	public static void main(String[] args) {

		var buckets = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
		System.out.println("PaintJob with four paramters is "+buckets);
		
		buckets = PaintJob.getBucketCount(7.25, 4.3, 2.35);
		System.out.println("PaintJob with four paramters is "+buckets);
		
		buckets = PaintJob.getBucketCount(3.26, 0.75);
		System.out.println("PaintJob with four paramters is "+buckets);
	}

}
