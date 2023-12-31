package com.AnormaisEBruna.petshop.models;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pets")
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String photoUrl;
    private String description;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProvidedServiceModel> providedServices;

    @ManyToMany(mappedBy = "pets", fetch = FetchType.EAGER)
    private List<ClientModel> clients;

    public static PetModel newInstance(String type, String name, String photoUrl, String description) {
        PetModel pet = new PetModel();

        pet.setType(type);
        pet.setName(name);
        pet.setPhotoUrl(photoUrl);
        pet.setDescription(description);
        pet.setClients(new ArrayList());
        pet.setProvidedServices(new ArrayList());

        return pet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProvidedServiceModel> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedServiceModel> providedServices) {
        this.providedServices = providedServices;
    }

    public List<ClientModel> getClients() {
        return clients;
    }

    public void setClients(List<ClientModel> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
