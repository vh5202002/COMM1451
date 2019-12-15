
public class AudioMaterail implements Comparable<AudioMaterail>{

	private String name;
	private double playingTimeInMinutes;
	/**
	 * @param name
	 * @param playingTimeInMinutes
	 */
	public AudioMaterail(String name, double playingTimeInMinutes) {
		super();
		this.name = name;
		this.playingTimeInMinutes = playingTimeInMinutes;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the playingTimeInMinutes
	 */
	public double getPlayingTimeInMinutes() {
		return playingTimeInMinutes;
	}
	/**
	 * @param playingTimeInMinutes the playingTimeInMinutes to set
	 */
	public void setPlayingTimeInMinutes(double playingTimeInMinutes) {
		this.playingTimeInMinutes = playingTimeInMinutes;
	}
	
	public int compareTo(AudioMaterail o) {
		if(this.playingTimeInMinutes - o.getPlayingTimeInMinutes() > 0) {
			return 1;
		}else if (this.playingTimeInMinutes - o.getPlayingTimeInMinutes() < 0) {
			return -1;
		}
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AudioMaterail [name=" + name + ", playingTimeInMinutes=" + playingTimeInMinutes + "]";
	}


}
