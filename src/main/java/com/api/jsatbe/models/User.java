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
}
