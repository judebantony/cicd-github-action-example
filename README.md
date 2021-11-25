# cicd-github-action-example
[![Quality Gate](https://sonarcloud.io/api/project_badges/quality_gate?project=judebantony_cicd-github-action-example&branch=main)](https://sonarcloud.io/project/overview?id=judebantony_cicd-github-action-example)
[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=coverage)](https://sonarcloud.io/component_measures/metric/coverage/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=bugs)](https://sonarcloud.io/component_measures/metric/reliability_rating/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=vulnerabilities)](https://sonarcloud.io/component_measures/metric/security_rating/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Code Smell](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=code_smells)](https://sonarcloud.io/component_measures/metric/code_smell/list?id=judebantony_cicd-github-action-example)

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fjudebantony%2Fcicd-github-action-example.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fjudebantony%2Fcicd-github-action-example?ref=badge_shield)

[![Main Branch](https://github.com/judebantony/cicd-github-action-example/actions/workflows/workflow.yml/badge.svg)](https://github.com/judebantony/cicd-github-action-example/actions/workflows/workflow.yml)

[![codecov](https://codecov.io/gh/judebantony/cicd-github-action-example/branch/main/graph/badge.svg?token=E3O3NABP1H)](https://codecov.io/gh/judebantony/cicd-github-action-example)


## CICD - SecDevOps using GitHub Action 

This is a sample project to demonstrate the E2E Github Action release workflow with all Security Controls and integrated with different Cloud SaaS tools offering as listed below.

1. Requirements 
    - JIRA <br />
		Used atlassian Jira cloud offering to capture the requirements.<br />
	    JIRA Project :: [https://judebantony.atlassian.net](https://judebantony.atlassian.net)	
2. Code
    - Spring Boot <br />
    - Java <br />
      Build a sample application using below frameworks.<br /> 
	  
3. SCM
     - GitHub		
4. Build
     - Mavan - [More Information](https://maven.apache.org) <br/>
5. CI
     - Github Action - [More Information](https://github.com/features/actions) <br/>
6. Code Quality
    - SonarQube [More Information](https://en.wikipedia.org/wiki/SonarQube)<br />
	     [Dashboard Example](https://sonarcloud.io/organizations/judebantony/projects)	<br />
    - Codecov - [More Information](https://docs.codecov.com/docs) <br/>
	    [Dashboard Example](https://codecov.io/gh/judebantony/cicd-github-action-example/commit/4b9f0f601ab2feee0e409ede57283d5b99b9182d/build)	<br />
	  	
7. SAST (Static Analysis Security Testing)
     - CodeQL - [More information](https://docs.github.com/en/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-with-codeql)
     - HCL AppScan CodeSweep - [More Information](https://www.hcltechsw.com/appscan/codesweep)	
     - Codacy - [More Information](https://www.codacy.com/products/sonarqube-alternatives?utm_term=sonarqube&utm_campaign=SEA+-+Competitors&utm_source=adwords&utm_medium=ppc&hsa_acc=9882323101&hsa_cam=11598890837&hsa_grp=112569261106&hsa_ad=493336668133&hsa_src=g&hsa_tgt=kwd-57815990976&hsa_kw=sonarqube&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAiA4veMBhAMEiwAU4XRr_qVWrji3IRgivxyqqPc3QrEMVwBQmQoACBfPuCL5H0gE0nmn3n2LhoCcgkQAvD_BwE)
8. SCA (Software Composition Analysis)
     - Snyk - [More Information](https://snyk.io)<br />
             [Dashboard Example](https://app.snyk.io/org/judebantony)
     - Dependabot - [More Information](https://github.blog/2020-06-01-keep-all-your-packages-up-to-date-with-dependabot/)
     - BlackDuck CoPilot - [More Information](https://www.synopsys.com/blogs/software-security/introducing-black-duck-copilot/) <br />
     		[Dashboard Example](https://copilot.blackducksoftware.com/github/repos/judebantony/cicd-github-action-example/results)
     - FOSSA [More Information](https://fossa.com)<br />
     		[Dashboard Example](https://app.fossa.com/projects/git%2Bgithub.com%2Fjudebantony%2Fcicd-github-action-example/refs/branch/main/0116ae3eef023ccfb56995ab2c4b10aaf5ffe1e1)
9. DAST (Dynamic Application Security Testing)
     - StackHawk - [More Information](https://www.stackhawk.com)<br />
     		[Dashboard Example](https://app.stackhawk.com/applications)
10. IaC Configs Scan
     - Snyk - [More Information](https://snyk.io)<br />
11. Secret Scan
     - Trufflehog - [More Information](https://github.com/trufflesecurity/truffleHog)<br />
12. Maven Repository
     - Jfrog Artifactory - [More Information](https://jfrog.com/artifactory/?utm_source=google&utm_medium=cpc&utm_campaign=14808689020&utm_term=jfrog%20artifactory&utm_network=g&cq_plac=&cq_plt=gp&gclid=Cj0KCQiAhf2MBhDNARIsAKXU5GTNwwGiZx5Msn96nvS7v3kLKexhg50OTeKFkyYJSfFDkmnKLb0OH38aAiOTEALw_wcB)<br />
     - Github Package - [More Information](https://github.com/trufflesecurity/truffleHog)<br />
13. Helm Repository
      - Jfrog Artifactiory - [More Information](https://jfrog.com/artifactory/?utm_source=google&utm_medium=cpc&utm_campaign=14808689020&utm_term=jfrog%20artifactory&utm_network=g&cq_plac=&cq_plt=gp&gclid=Cj0KCQiAhf2MBhDNARIsAKXU5GTNwwGiZx5Msn96nvS7v3kLKexhg50OTeKFkyYJSfFDkmnKLb0OH38aAiOTEALw_wcB)<br /> 
14. Container Scan - Docker Image
      - Snyk - [More Information](https://snyk.io)<br />
      - JFrog Xray - [More Information](https://jfrog.com/artifactory/?utm_source=google&utm_medium=cpc&utm_campaign=14808689020&utm_term=jfrog%20artifactory&utm_network=g&cq_plac=&cq_plt=gp&gclid=Cj0KCQiAhf2MBhDNARIsAKXU5GTNwwGiZx5Msn96nvS7v3kLKexhg50OTeKFkyYJSfFDkmnKLb0OH38aAiOTEALw_wcB)<br />
15. Container Repository
     - JFrog Artifactory - [More Information](https://jfrog.com/artifactory/?utm_source=google&utm_medium=cpc&utm_campaign=14808689020&utm_term=jfrog%20artifactory&utm_network=g&cq_plac=&cq_plt=gp&gclid=Cj0KCQiAhf2MBhDNARIsAKXU5GTNwwGiZx5Msn96nvS7v3kLKexhg50OTeKFkyYJSfFDkmnKLb0OH38aAiOTEALw_wcB)<br />
     - Github Package - [More Information](https://github.com/features/packages)<br />
     - DockerHub - [More Information](https://hub.docker.com/r/judebantony/cigithubaction)<br />
16. Deploying to Azure - AKS
     - GitHub Action & K8S native 
17. Deploying to Azure - AKS
     - GitHub Action & Helm Chart - [More Information](https://helm.sh/docs/topics/charts/)<br />
18. Deploying to GCP - GKE 
     - GitHub Action & Harness - [More Information](https://harness.io)<br />
19. Provisioning AWS - EC2
     - Terraform - [More Information](https://www.terraform.io)<br />
20. Unit Testing
     - Junit - [More Information](https://junit.org/junit5/)<br />
21. Functional Testing
     - Cucumber - [More Information](https://cucumber.io)<br />
     - Selenium - [More Information](https://www.selenium.dev)<br />
     - BrowserStack - [More Information](https://www.browserstack.com)<br />
     - LamdaTest - [More Information](https://www.lambdatest.com)<br />
22. Performance Testing
     - K6 - [More Information](https://k6.io)<br />
23. Create Release Tag
	 
## Integration with GitHub Action
Some the sample code for integrating different SaaS tool to CICD using GitHub Action 
### 1) Maven - Build and Unit Test

```yaml

  test:
    name: Build and Unit Test
    runs-on: ubuntu-latest
    
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build
        run: mvn -B clean package -DskipTests
      - name: Run UnitTest and Verify 
        run: mvn -B verify -DexcludedGroups="Smoke | Staging | BrowserStack | LamdaTest"
      - name: Generate JaCoCo Badge
        id: jacoco
        uses: cicirello/jacoco-badge-generator@v2
      - name: Log code coverage percentage
        run: |
          echo "coverage = ${{ steps.jacoco.outputs.coverage }}"
          echo "branch coverage = ${{ steps.jacoco.outputs.branches }}"
      - name: Upload code coverage report
        uses: actions/upload-artifact@v2
        with:
          name: jacoco-report
          path: target/site/jacoco/
      - name: Adding Junit Report
        uses: ashley-taylor/junit-report-annotations-action@master
        if: always()
        with:
          access-token: ${{ secrets.GITHUB_TOKEN }}          
      - name: Publish Unit Test Results
        uses: EnricoMi/publish-unit-test-result-action/composite@v1
        with:
           files: target/surefire-reports/*.xml

```
### 2) Sonar Cloud - Code Quality

```yaml
  sonar:
    name: Inspect - Using Sonar
    runs-on: ubuntu-latest
    needs: [test]
    
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: 11
      - name: Cache SonarCloud packages
        uses: actions/cache@v1
        with:
          path: ~/.sonar/cache
          key: ${{ runner.os }}-sonar
          restore-keys: ${{ runner.os }}-sonar
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build and analyze
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        run: mvn -B verify -DexcludedGroups="Smoke | Staging | LamdaTest | BrowserStack" org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.issuesReport.html.enable=true -Dsonar.projectKey=judebantony_cicd-github-action-example
      - name: SonarQube Quality Gate check
        uses: sonarsource/sonarqube-quality-gate-action@master
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}   
        timeout-minutes: 5     
        with:
          scanMetadataReportFile: target/sonar/report-task.txt     

```

### 3) Codecov - Code Coverage

```yaml
  codecov:
    name: Inspect - Using Codecov
    runs-on: ubuntu-latest
    needs: [test]
    
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK 8
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build and analyze
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        run: mvn -B verify -DexcludedGroups="Smoke | Staging | LamdaTest | BrowserStack" cobertura:cobertura
      - name: Upload coverage to Codecov
        uses: codecov/codecov-action@v2
        with:
          token: ${{ secrets.CODECOV_TOKEN }} 
          flags: unittests 
          name: codecov-umbrella 
          fail_ci_if_error: true 
          verbose: true     

```

### 4) CodeQL - SAST

```yaml
  codeqlScan:
      name: SAST Scan using CodeQL
      runs-on: ubuntu-latest
      needs: [sonar, codecov]
      
      permissions:
        actions: read
        contents: read
        security-events: write
      strategy:
        fail-fast: false
        matrix:
          language: [ 'java' ]
          
      steps:
      - name: Checkout repository
        uses: actions/checkout@v2
        with:
           fetch-depth: 0
      - name: Initialize CodeQL
        uses: github/codeql-action/init@v1
        with:
          languages: ${{ matrix.language }}
      - name: Autobuild
        uses: github/codeql-action/autobuild@v1
      - name: Perform CodeQL Analysis
        uses: github/codeql-action/analyze@v1

```

### 5) AppScan CodeSweep - SAST 

```yaml
  appScan:
    name: SAST Scan using AppScan CodeSweep
    runs-on: ubuntu-latest
    needs: [sonar, codecov]
    
    steps:
      - name: Checkout repository
        uses: actions/checkout@v2
        with:
           fetch-depth: 0
      - name: Run AppScan CodeSweep
        uses: HCL-TECH-SOFTWARE/appscan-codesweep-action@v1
        with:
            asoc_key: ${{secrets.ASOC_KEY}}
            asoc_secret: ${{secrets.ASOC_SECRET}}
        env: 
          GITHUB_TOKEN: ${{secrets.GITHUB_TOKEN}}
```

### 6) Codacy - SAST 

```yaml
  codacyScan:
      name: SAST Scan using Codacy
      runs-on: ubuntu-latest
      needs: [sonar, codecov]
      
      steps:
        - uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: Run Codacy Analysis CLI
          uses: codacy/codacy-analysis-cli-action@master
          with:
            output: codacy.sarif
            format: sarif
            gh-code-scanning-compat: true
            max-allowed-issues: 2147483647
        
        - name: Upload SARIF results file
          uses: github/codeql-action/upload-sarif@main
          with:
            sarif_file: codacy.sarif          
```

### 7) Snyk - SCA 

```yaml
  snykScan:
      name: SCA Scan using Snyk
      runs-on: ubuntu-latest
      needs: [codeqlScan, codacyScan, appScan]
          
      steps:
      - uses: actions/checkout@v2
        with:
          fetch-depth: 0
      - name: Set up Maven
        run: mvn -N io.takari:maven:wrapper -Dmaven=3.8.2
      - name: Run Snyk to check for vulnerabilities
        continue-on-error: true      
        uses: snyk/actions/maven-3-jdk-11@master
        env:
           SNYK_TOKEN: ${{ secrets.SNYK_TOKEN }}
        with:
          args: --sarif-file-output=snyk.sarif
      - name: Upload result to GitHub Code Scanning
        uses: github/codeql-action/upload-sarif@v1
        with:
          sarif_file: snyk.sarif

```

### 8) Dependabot - SCA 

```yaml dependabot.yml

version: 2
updates:
  - package-ecosystem: "maven"
    directory: "/" 
    schedule:
      interval: "daily"
  - package-ecosystem: "docker"
    directory: "/"
    schedule:
      interval: "weekly"

```

### 9) BlackDuck CoPilot - SCA 

```yaml 

  blackduck:
      name: SCA Scan using BlackDuck
      runs-on: ubuntu-latest
      needs: [codeqlScan, codacyScan, appScan] 

      steps:
        - name: Check out the code
          uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: Set up JDK
          uses: actions/setup-java@v1
          with:
            java-version: 1.8
        - name: Set up Maven
          run: mvn -N io.takari:maven:wrapper -Dmaven=3.8.2
        - name: Build with Maven
          run: |
            mvn install -DskipTests=true -Dmaven.javadoc.skip=true -B -V
            mvn test -B
        - name: Upload to CoPilot
          run: bash <(curl -s https://copilot.blackducksoftware.com/ci/githubactions/scripts/upload)


```

### 10) FOSSA - SCA 

```yaml 

  fossaScan:
      name: SCA Scan using FOSSA
      runs-on: ubuntu-latest
      needs: [codeqlScan, codacyScan, appScan]  
      
      steps:
        - name: Check out the code
          uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: Run FOSSA Scan
          uses: fossas/fossa-action@v1
          with:
            api-key: ${{secrets.FOSSA_APIKEY}}


```

### 11) Snyk - Infra as Code Configs Scan

```yaml 

  snykIaSScan:
      name: SAST - Scan IaC Configs using Snyk
      runs-on: ubuntu-latest
      needs: [dependabot, snykScan, blackduck, fossaScan]
      
      steps:
        - name: Check out the code
          uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: Run Snyk to check configuration files for security issues
          continue-on-error: true
          uses: snyk/actions/iac@master
          env:
            SNYK_TOKEN: ${{ secrets.SNYK_TOKEN }}
          with:
            file: |
              manifests/deployment.yml
              manifests/service.yml
        - name: Upload result to GitHub Code Scanning
          uses: github/codeql-action/upload-sarif@v1
          with:
            sarif_file: snyk.sarif


```

## Author

Jude Antony ([LinkedIn](https://www.linkedin.com/in/jude-antony-2b208219/))