import { type } from "os";
import { Plataform } from "../records/types";

export type Game = {
    id: number;
    title: string;
    platform: Plataform;
}

export type ChartItem = {
    x: string;
    y: number;
}