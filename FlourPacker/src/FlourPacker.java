public class FlourPacker {

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
				
		while (goal > 0) {
			if (goal >= 4 && (smallCount < 4 && bigCount < 1)) {
				return false;
			}	else if (bigCount > 0 && goal > 4 && (goal / 5) > 0) {
				System.out.println("First check "+goal);
					bigCount--;
					goal -= 5;
				if (goal == 0)
					return true;
				System.out.println("Second check "+goal);
			}	else if (smallCount > 0) {
				smallCount--;
				goal--;
				System.out.println("Third check "+goal);
				if (goal == 0)
					return true;
			} else	return false;
		}
		return false;
	}
}