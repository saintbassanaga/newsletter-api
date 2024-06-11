package tech.saintbassanaga.newletterapi.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

  private String lineOne;
  private String lineTree;
  private String lineFour;

  private String City;
  private String country;
  private String countryCode;
  private String postalCode;
}