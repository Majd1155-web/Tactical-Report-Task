export interface Item {
  id: string;
  name: string;
  description: string;
}

export interface ApiResponse<T> {
  success: boolean;
  message: string;
  returnField: T;
}