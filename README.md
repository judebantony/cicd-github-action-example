# cicd-github-action-example
[![Quality Gate](https://sonarcloud.io/api/project_badges/quality_gate?project=judebantony_cicd-github-action-example&branch=main)](https://sonarcloud.io/project/overview?id=judebantony_cicd-github-action-example)
[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=coverage)](https://sonarcloud.io/component_measures/metric/coverage/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=bugs)](https://sonarcloud.io/component_measures/metric/reliability_rating/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=vulnerabilities)](https://sonarcloud.io/component_measures/metric/security_rating/list?id=judebantony_cicd-github-action-example)
[![SonarCloud Code Smell](https://sonarcloud.io/api/project_badges/measure?project=judebantony_cicd-github-action-example&metric=code_smells)](https://sonarcloud.io/component_measures/metric/code_smell/list?id=judebantony_cicd-github-action-example)

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fjudebantony%2Fcicd-github-action-example.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fjudebantony%2Fcicd-github-action-example?ref=badge_shield)

[![Main Branch](https://github.com/judebantony/cicd-github-action-example/actions/workflows/workflow.yml/badge.svg)](https://github.com/judebantony/cicd-github-action-example/actions/workflows/workflow.yml)

[![codecov](https://codecov.io/gh/judebantony/cicd-github-action-example/branch/main/graph/badge.svg?token=E3O3NABP1H)](https://codecov.io/gh/judebantony/cicd-github-action-example)

### Easily upload coverage reports to Codecov from GitHub Actions


## E2E CICD - SecDevOps

This is a sample project to demonstrate the E2E Github Action release workflow with all Security Controls and integrated with different Cloud SaaS tools offering as listed below.

1. Requirements <br />
	   - JIRA <br />
			 Used atlassian Jira cloud offering to capture the requirements.<br />
	 JIRA Project :: [https://judebantony.atlassian.net](https://judebantony.atlassian.net)	
	  
2. Code <br />
	  - Spring Boot
	  - Java
	  
3. SCM <br />
	  - GitHub		
4. Build <br />
	  - Mavan
5. CI	<br /> 
	  - Github Action <br />
	  	Used 
6. Code Quality <br />
	  - SonarQube <br />
		  SonarQube is an open-source platform developed by SonarSource for continuous inspection of code quality to perform automatic reviews with static analysis of code to detect bugs, code smells, and security vulnerabilities on 20+ programming languages. <br />
	  SonarQube :: [Dashboard Example](https://sonarcloud.io/organizations/judebantony/projects)	<br />
	  - Codecov - [More Information](https://docs.codecov.com/docs) <br/>
	    [Dashboard Example](https://codecov.io/gh/judebantony/cicd-github-action-example/commit/4b9f0f601ab2feee0e409ede57283d5b99b9182d/build)	<br />
	  	
7. SAST (Static Analysis Security Testing)
     - CodeQL - CodeQL is the code analysis engine developed by GitHub to automate security checks. [More information](https://docs.github.com/en/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-with-codeql)
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
     - Snyk
11. Secret Scan
	 - Trufflehog
12. Maven Repository
     - Jfrog Artifactory 
     - Github Package
13. Helm Repository
      - Jfrog Artifactiory    
14. Container Scan - Docker Image
      - Snyk 
      - JFrog Xray
15. Container Repository
     - JFrog Artifactory
     - Github Package
     - DockerHub
16. Deploying to Azure - AKS
	  - GitHub Action & K8S native 
17. Deploying to Azure - AKS
	  - GitHub Action & Helm Chart 
18. Deploying to GCP - GKE 
	  - GitHub Action & Harness
19. Provisioning AWS - EC2
	  - Terraform 	
20. Unit Testing
      - Junit
21. Functional Testing
	  - Cucumber
	  - Selenium
	  - BrowserStack
	  - LamdaTest 
22. Performance Testing
	  - K6 
23. Create Release Tag
	 


## License
