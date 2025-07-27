import { CalculateScore } from '../src/components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"Mugilan"} 
        School={"SNS COLLEGE OF TECHNOLOGY"} 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;
