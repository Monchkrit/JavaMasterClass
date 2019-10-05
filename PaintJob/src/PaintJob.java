
public class PaintJob {
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		double area = width * height;
		double check = area / areaPerBucket;
		System.out.println("The check is "+check);
		System.out.println("The area is "+area);
		int numBuckets = (int) (area / areaPerBucket);
		
		return (numBuckets - extraBuckets + 1);
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
			
		double area = width * height;	
		int numBuckets = (int)(area / areaPerBucket);
		
		return (numBuckets + 1);
	}
		
	public static int getBucketCount(double area, double areaPerBucket) {
		
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int numBuckets = (int)(area / areaPerBucket);
		
		return (numBuckets + 1);
	}
}
