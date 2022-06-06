package fashionable.simba.yanawa.controller.dto;

import java.time.LocalDateTime;

public class MatchingDto {
    private final Long matchingId;
    private final Long courtId;

    public Long getCourtId() {
        return courtId;
    }

    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Integer annual;
    private final Double minimumLevel;
    private final Double maximumLevel;
    private final Integer ageOfRecruitment;
    private final GenderType sexOfRecruitment;
    private final PreferenceType preferenceGame;
    private final Integer numberOfnumberOf;
    private final Double costOfCourtPerPerson;
    private final String details;
    private final StatusType status;
    private final Long hostId;

    private MatchingDto(Builder builder) {
        this.matchingId           = builder.matchingId;
        this.courtId              = builder.courtId;
        this.startDate            = builder.startDate;
        this.endDate              = builder.endDate;
        this.annual               = builder.annual;
        this.minimumLevel         = builder.minimumLevel;
        this.maximumLevel         = builder.maximumLevel;
        this.ageOfRecruitment     = builder.ageOfRecruitment;
        this.sexOfRecruitment     = builder.sexOfRecruitment;
        this.preferenceGame       = builder.preferenceGame;
        this.numberOfnumberOf     = builder.numberOfnumberOf;
        this.costOfCourtPerPerson = builder.costOfCourtPerPerson;
        this.details              = builder.details;
        this.status               = builder.status;
        this.hostId               = builder.hostId;
    }
    public static class Builder {
        private final Long matchingId;
        private Long courtId;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Integer annual;
        private Double minimumLevel;
        private Double maximumLevel;
        private Integer ageOfRecruitment;
        private GenderType sexOfRecruitment;
        private PreferenceType preferenceGame;
        private Integer numberOfnumberOf;
        private Double costOfCourtPerPerson;
        private String details;
        private StatusType status;
        private Long hostId;

        public Builder(Long matchingId){
            this.matchingId = matchingId;
        }
        public Builder courtId(Long courtId){
            this.courtId = courtId;
            return this;
        }
        public Builder startDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder endDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder annula(Integer annual) {
            this.annual = annual;
            return this;
        }
        public Builder minimumLevel(Double minimumLevel) {
            this.minimumLevel = minimumLevel;
            return this;
        }
        public Builder maximumLevel(Double maximumLevel) {
            this.maximumLevel = maximumLevel;
            return this;
        }
        public Builder ageOfRecruitment(Integer ageOfRecruitment) {
            this.ageOfRecruitment = ageOfRecruitment;
            return this;
        }
        public Builder sexOfRecruitment(GenderType sexOfRecruitment) {
            this.sexOfRecruitment = sexOfRecruitment;
            return this;
        }
        public Builder preferenceGame(PreferenceType preferenceGame) {
            this.preferenceGame = preferenceGame;
            return this;
        }
        public Builder numberOfnumberOf(Integer numberOfnumberOf) {
            this.numberOfnumberOf = numberOfnumberOf;
            return this;
        }
        public Builder costOfCourtPerPerson(Double costOfCourtPerPerson) {
            this.costOfCourtPerPerson = costOfCourtPerPerson;
            return this;
        }
        public Builder details(String details) {
            this.details = details;
            return this;
        }
        public Builder status(StatusType status) {
            this.status = status;
            return this;
        }
        public Builder hostId(Long hostId) {
            this.hostId = hostId;
            return this;
        }
        public MatchingDto build(){
            return new MatchingDto(this);
        }
    }
}
