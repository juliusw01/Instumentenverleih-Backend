package Ingo.Instrumentenverleih.model;

import org.springframework.lang.NonNull;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


        @Entity
        @Table(name="instruments")
        public class Instrument{

            @Id
            @Column(columnDefinition= "VARBINARY(16)")
            @GeneratedValue(strategy = GenerationType.AUTO)
            private UUID id;

            @Column
            @NonNull
            private String name;

            @Column
            @NonNull
            private String beschreibung;

            @Column
            @NonNull
            private double preis;

            @Column
            @NonNull
            private String kategorie;

            @Column
            @NonNull
            private boolean isAusgeliehen;

            public Instrument() {

            }

            public Instrument(String name, String beschreibung, double preis, String kategorie) {
                super();
                this.name = name;
                this.beschreibung = beschreibung;
                this.preis = preis;
                this.kategorie = kategorie;
                this.isAusgeliehen = false;
            }


            public String getKategorie() {
                return kategorie;
            }

            public void setKategorie(String kategorie) {
                this.kategorie = kategorie;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setBeschreibung(String beschreibung) {
                this.beschreibung = beschreibung;
            }

            public void setPreis(double preis) {
                this.preis = preis;
            }

            public UUID getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getBeschreibung() {
                return beschreibung;
            }

            public double getPreis() {
                return preis;
            }

            public void setId(UUID id) {
                this.id = id;
            }

            public boolean getIsAusgeliehen() {
                return isAusgeliehen;
            }

            public void setIsAusgeliehen(boolean isAusgeliehen) {
                this.isAusgeliehen = isAusgeliehen;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                long temp = Double.doubleToLongBits(preis);
                result = prime * result + (int)(temp ^ (temp >>> 32));
                result = prime * result + ((beschreibung == null) ? 0 : beschreibung.hashCode());
                result = prime * result + ((id == null) ? 0 : id.hashCode());
                result = prime * result + ((name == null) ? 0 : name.hashCode());
                result = prime * result + ((kategorie == null) ? 0 : kategorie.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Instrument that = (Instrument) o;
                return Double.compare(that.preis, preis) == 0 && isAusgeliehen == that.isAusgeliehen && Objects.equals(id, that.id) && name.equals(that.name) && beschreibung.equals(that.beschreibung) && kategorie.equals(that.kategorie);
            }
        }




