package nextstep.subway.station.domain;

import nextstep.subway.common.BaseEntity;

import javax.persistence.*;

@Entity
public class Station extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    public Station() {
    }

    public Station(String name) {
        this.name = name;
    }

    public Station(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Station of(long id, String name) {
        return new Station(id, name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSameName(Station upStation) {
        return this.name.equals(upStation.getName());
    }
}
