# Execute SonarQube

```bash
./gradlew sonar \
  -Dsonar.projectKey=SonarQubeMultimodule \
  -Dsonar.host.url=http://localhost:9001 \
  -Dsonar.login=sqp_bb80706dccc938c5b3f854f97db739144809459c
```

## Sonrqube scanning

1. Plugin needs to be on the root project
2. On any child module

## Important notes about sonarqube

- Too few new lines will not trigger failure of sonarqube report