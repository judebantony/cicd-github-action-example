import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  ext: {
    loadimpact: {
      projectID: 3560884,
      // Test runs with the same name groups test runs together
      name: "Jude Test"
    }
  },
  	
  duration: '1m',
  vus: 10,
  thresholds: {
    http_req_duration: ['p(95)<500'],
  },
};

export default function () {
  const res = http.get('http://githubaction-terraform-example-2141246354.ap-south-1.elb.amazonaws.com');
  sleep(1);
}