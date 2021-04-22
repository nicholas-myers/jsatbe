package com.api.jsatbe.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jobseekers")
public class JobSeeker
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long userid;

   private String jobseekername;

   private String password;

   private List<DailyActivity> dailies = new ArrayList<>();

   private List timesheets = new ArrayList<>();
}
