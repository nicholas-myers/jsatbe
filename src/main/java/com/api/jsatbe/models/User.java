package com.api.jsatbe.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long userid;

   private String username;

   private String password;

   private List resources = new ArrayList<>();

   private List contacts = new ArrayList<>();

   private List meetings = new ArrayList<>();

   public User(){}

   public User(String username, String password)
   {
      this.username = username;
      this.password = password;
   }

   public long getUserid()
   {
      return userid;
   }

   public void setUserid(long userid)
   {
      this.userid = userid;
   }

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public List getResources()
   {
      return resources;
   }

   public void setResources(List resources)
   {
      this.resources = resources;
   }

   public List getContacts()
   {
      return contacts;
   }

   public void setContacts(List contacts)
   {
      this.contacts = contacts;
   }

   public List getMeetings()
   {
      return meetings;
   }

   public void setMeetings(List meetings)
   {
      this.meetings = meetings;
   }
}
