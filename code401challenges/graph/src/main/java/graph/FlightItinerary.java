package graph;

import java.util.ArrayList;

public class FlightItinerary {

    public Output isFlightPossible(Graph graph, Vertex[] arrayOfCities) {

        Output output = new Output(false, 0);
        ArrayList<Edge> allNeighbors;

        for (int i = 0; i < arrayOfCities.length; i++) {
            allNeighbors = graph.getNeighbors(arrayOfCities[i]);

            //If the next city is not the neighboring cities, then it is not possible to fly
            if(i + 1 < arrayOfCities.length && allNeighbors.contains(arrayOfCities[i + 1])) {
                return new Output(false, 0);
            }

            if (i +1 < arrayOfCities.length) {
                Vertex nextValue = arrayOfCities[i + 1];

                for (Edge item : allNeighbors) {
                    if (item.vertex == nextValue) {
                        output.setPossible(true);
                        output.setValue(output.getValue() + item.weight);
                    }
                }
            }


        }

        return output;
    }
}
