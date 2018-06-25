package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

public class User implements Serializable {
	private String name;
	private String email;
        private String password;
        private String address;
        private String phone;
        private String bio;
        private ImageIcon profilePicture;
        private List<ImageIcon> pictures;
	private Date dob;  
        private List<Post> feed;
        private List<User> groups;
	private List<User> friends;
	private List<User> friendRequests;
        private List<User> blacklist;
	
	public User(String name, String password, String email, Date dob) {
		this.name = name;
		this.email = email;
                this.password = password;
		this.dob = dob;
		
		this.feed = new ArrayList();
		this.friends = new ArrayList();
		this.friendRequests = new ArrayList();
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
        
            public String getPassword() {
        return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }       

        public ImageIcon getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(ImageIcon profilePicture) {
            this.profilePicture = profilePicture;
        }

        public List<ImageIcon> getPictures() {
            return pictures;
        }

        public void addPicture(ImageIcon picture) {
            this.pictures.add(picture);
        }

        public List getFeed() {
            return feed;
        }

        public void addPost(Post post) {
            this.feed.add(post);
        }

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDob() {
		return dob;
	}
        
        public String getDobString(){
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            return df.format(dob);
        }
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User newFriend) {
		this.friends.add(newFriend);
		this.friendRequests.remove(newFriend);
	}
	
	public List<User> getFriendRequests(){
		return friendRequests;
	}
	
	public void addFriendRequest(User friendRequest) {
		this.friendRequests.add(friendRequest);
	}

        public List<User> getGroups() {
            return groups;
        }

        public void setGroups(List<User> groups) {
            this.groups = groups;
        }

        public List<User> getBlacklist() {
            return blacklist;
        }

        public void setBlacklist(List<User> blacklist) {
            this.blacklist = blacklist;
        }        
}
